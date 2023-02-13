public class task1 {
    public static class Notebook {
        int id;
        String manufacturer;
        String model_name;
        String RAM;
        String HDD;
        String OS;
        int price;

        public Notebook(int id, String manufacturer, String model_name, String RAM, String HDD, String OS, int price) {
            this.id = id;
            this.manufacturer = manufacturer;
            this.model_name = model_name;
            this.RAM = RAM;
            this.HDD = HDD;
            this.OS = OS;
            this.price = price;
        }

        public String printNotebook() {
            return "id:" + id, ", manufacturer:" + manufacturer, ", model_name:" + model_name, ", RAM:" + RAM, ", HDD:" + HDD, ", OS:" + OS, ", price:" + price;
        }
    }

    public static void main(String[] args) {
        Notebook notebook_1 = new Notebook(12345, "ASUS", "ASUS X515EA-BQ1461W", "8 GB", "256 GB",
                "Windows 11", 36069);
        Notebook notebook_2 = new Notebook(23456, "Apple", "Apple MacBook Air 13 2022", "8 GB", "256 GB",
                "macOS", 94990);
        Notebook notebook_3 = new Notebook(34567, "Acer", "Acer Aspire 7 A715-42G-R427", "16 GB", "512 GB",
                "Windows 11", 92134);
        Notebook notebook_4 = new Notebook(45678, "Dell", "Dell Alienware M15 R5", "16 GB", "1 TB",
                "Windows 11", 159000);
    }
}