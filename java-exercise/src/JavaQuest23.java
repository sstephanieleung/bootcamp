/*
 * Question : 
 * given a string s of even length. 
 * Split this string into two halves of equal lengths, 
 * and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. 
Otherwise, return false.
 */

//hints : substring() , toCharArray() ?
public class JavaQuest23 {

  public boolean sameNumberOfVowels(String s) {
    // code here
    String a = s.substring(0,s.length()/2);
    String b = s.substring(s.length()/2);
    int[] vowel = new int[5];
    for(int i = 0 ; i< a.length(); i++){
      switch(a.charAt(i)){
          case 'a':
          case 'A':
            vowel[0]++;
            break;
          case 'e':
          case 'E':
            vowel[1]++;
            break;
          case 'i':
          case 'I':
            vowel[2]++;
            break;
          case 'o':
          case 'O':
            vowel[3]++;
            break;
          case 'u':
          case 'U':
            vowel[4]++;
            break;
          default:
            break;
      }
      switch(b.charAt(i)){
          case 'a':
          case 'A':
            vowel[0]--;
            break;
          case 'e':
          case 'E':
            vowel[1]--;
            break;
          case 'i':
          case 'I':
            vowel[2]--;
            break;
          case 'o':
          case 'O':
            vowel[3]--;
            break;
          case 'u':
          case 'U':
            vowel[4]--;
            break;
          default:
            break;
      }
    }
    for(int i = 0; i< vowel.length; i++){
      if(vowel[i] !=0){
        return false;
      }
    }
    return true;
  }
}
