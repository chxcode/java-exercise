package basic;

public enum SizeEnum {

    SMALL(10, "小号"),

    MEDIUM(20, "中号"),

    LARGE(30, "大号");

    private Integer id;
    private String msg;

    private SizeEnum(Integer id, String msg){
        this.id = id;
        this.msg = msg;
    }

    public Integer getId(){
        return this.id;
    }
}
