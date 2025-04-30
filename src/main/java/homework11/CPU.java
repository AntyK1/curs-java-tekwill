package homework11;

public class CPU {
    private String type1 = "Processor inside CPU";
    private String type2 = "RAM inside CPU";

    public class Processor {
        public void showType() {
            System.out.println(type1);
        }
    }

    public class RAM {
        public void showType() {
            System.out.println(type2);
        }
    }
}

