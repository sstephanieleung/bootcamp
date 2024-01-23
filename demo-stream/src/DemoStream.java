import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
        public static void main(String[] args) throws Exception {
                List<String> strings = new ArrayList<>(List.of("Hello", "world", "vincent", "oscar"));
                List<String> result = new ArrayList<>();
                // filter out string with length <= 5
                for (String e : strings)
                        if (e.length() > 5)
                                result.add(e);
                System.out.println(result);

                // stream() <- list can invoke this method
                result = strings.stream() // Convert the list to stream type, performing similar function as for-each
                                          // loop
                                .filter(s -> s.length() > 5) // Predicate: s -> s.length()>5
                                .collect(Collectors.toList()); // return to List<String>

                List<Cat> cats = new ArrayList<>(List.of(new Cat("ABC", 12), new Cat("DEF", 3)));
                // stream(), name startsWith "D", age < 2

                // filter cat -> return List<Cat>
                List<Cat> newCat = cats.stream()
                                .filter(e -> e.getName().startsWith("D"))
                                .filter(e -> e.getAge() < 2)
                                .collect(Collectors.toList());
                System.out.println(newCat);

                // filter cat -> return List<String>
                List<String> newStr = cats.stream()
                                .filter(e -> e.getName().startsWith("D"))
                                .filter(e -> e.getAge() < 2)
                                .map(e -> e.getName())
                                .collect(Collectors.toList());
                System.out.println(newStr);

                // Covert List<Cat> to List<Dog>
                List<Dog> dogs = cats.stream()
                                .map(e -> {
                                        return new Dog(e.getAge());
                                })
                                .collect(Collectors.toList());
                System.out.println(dogs);

                List<Dog> dogs2 = new ArrayList<>();
                for (Cat e : cats) {
                        dogs2.add(new Dog(e.getAge()));
                }
                System.out.println(dogs2);

                List<Staff> staffs = new ArrayList<>(List.of(new Staff("John", 20000.0d), new Staff("John", 15000.0d)));

                double sum = 0.0d;
                for (Staff e : staffs)
                        sum += e.getSalary();
                System.out.println(sum);

                double max = -1.0d;
                for (Staff e : staffs)
                        max = Math.max(max, e.getSalary());
                System.out.println(max);

                // stream
                double sumOfSalary = staffs.stream()
                                .map(e -> e.getSalary()) // double Auto-box to Double
                                .mapToDouble(d -> d) // Double convert to DoubleStream
                                .sum(); // .sum() -> terminate operation

                List<Double> total = staffs.stream()
                                .map(e -> e.getSalary())
                                .collect(Collectors.toList()); // .collect() -> terminate operation

                long countOfStaff = staffs.stream()
                                .map(e -> {
                                        System.out.println("hello");
                                        return e;
                                }) // .map() -> intermediate operation
                                .count(); // .count() -> terminate operation

                System.out.println(countOfStaff);

                long count = staffs.stream().count();
                System.out.println(count);

                // toSet()
                List<Cat> cats2 = new ArrayList<>(List.of(new Cat("DEF", 10), new Cat("DEF", 3), new Cat("IJK", 1)));
                Set<Cat> result4 = cats2.stream().collect(Collectors.toSet());
                System.out.println(result4);

                // .distinct()
                List<Cat> distinctCats = cats.stream().distinct().filter(e -> e.getAge() >= 3)
                                .collect(Collectors.toList());
                System.out.println(distinctCats);

                // Prepare 2 customers, each of them has his own addresses
                List<Customer> customers = new ArrayList<>();
                Customer c1 = new Customer();
                Customer c2 = new Customer();
                c1.addAddr("ABC Building", "ABC Road", District.KWUN_TONG);
                c2.addAddr("BCD Building", "BCD Road", District.KWUN_TONG);

                customers.add(c1);
                customers.add(c2);

                List<Customer.Address> a1 = customers.stream()
                                .flatMap(c -> c.getAddr().stream()).collect(Collectors.toList());
                List<List<Customer.Address>> a2 = customers.stream().map(c -> c.getAddr()).collect(Collectors.toList());

                System.out.println(a1);
                System.out.println(a2);

                // List<List<Integer>>
                List<List<Integer>> integerList = new ArrayList<>(
                                List.of(new ArrayList<>(List.of(1, 3, 5)),
                                                new ArrayList<>(List.of(2, 4, 5))));
                // //List<Integer>
                List<Integer> integers = integerList.stream()
                                .flatMap(e -> e.stream())
                                .sorted((e1, e2) -> e2 > e1 ? 1 : -1)
                                .collect(Collectors.toList());
                System.out.println(integers);

                // Exercise: Return a list of cat names, with age > 9, order by the age of cats
                List<String> catName = cats.stream()
                                .filter(e -> e.getAge() > 9)
                                .sorted()
                                .map(e -> e.getName())
                                .collect(Collectors.toList());
                System.out.println(catName);

                boolean hasKaris = cats.stream().anyMatch(e -> "Karis".equals(e.getName()));
                System.out.println(hasKaris);

                Map<Boolean, List<Cat>> catMap = cats.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 5));
                System.out.println(catMap.get(true));
                System.out.println(catMap.get(false));

                // Map<Category, Integer> sumCart =

                // for-each
                int x = 100;
                for (Cat cat : cats) {
                        System.out.println("x");
                        x = 10;
                }

                // List<Cat> result10 = cats.stream().forEach(e -> {
                // System.out.println(e.getAge());
                // // m += e.getAge();
                // // System.out.println(x); // error, No read operation on the variabl outside
                // the stream
                // });

                // sum up all cats age
                int sumAge = cats.stream().map(e -> e.getAge()).mapToInt(i -> i).sum();
                System.out.println("Totla age of cats are: " + sumAge);

                Stream<Cat> sc = Stream.of(new Cat("ABC",3),new Cat("IJK",12));
                List<Cat> result11 = sc.filter(e -> e.getAge()>10).collect(Collectors.toList());

                Cat cat = null;
                Stream<Cat> sc2 = Stream.ofNullable(null);  //empty Stream
                sc2.forEach(e -> {
                        System.out.println("hello");
                });

                Stream<Cat> sc3 = Stream.of(cat);
        }
}
