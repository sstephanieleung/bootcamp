public enum RegionCode {
    HKG(852),
    PRC(86),
    MACAU(853),
    ;

    private int code;

    private RegionCode(int i){
        this.code = i;
    }
    public int code(){
        return this.code;
    }
}
