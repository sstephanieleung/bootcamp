public enum District {
    
    KOWLOON_CITY("KOWLOON CITY","KLN"),
    KWAI_TSING("KWAIT SING","KLN"),
    KWUN_TONG ("KWUN TONG","KLN"),
    ;

    private String name;

    private String region;

    private District(String name, String region){
        this.name = name;
        this.region = region;
    }

    public String value(){
        return this.name;
    }

    public String region(){
        return this.region;
    }

}
