import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

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

        public String toString() {
            return "id: " + id + "\n" +
                    "Manufacturer: " + manufacturer + "\n" +
                    "Model_name: " + model_name + "\n" +
                    "RAM: " + RAM + "\n" +
                    "HDD: " + HDD + "\n" +
                    "OS: " + OS + "\n" +
                    "Price: " + price + "\n";
        }

        public List<Notebook> findNotebook(HashSet<Notebook> hashNotebooks, String str) {
            List<Notebook> notebookList = new ArrayList<Notebook>();
            for (Notebook i : hashNotebooks) {
                if (i.manufacturer.equals(str)) {
                    notebookList.add(i);
                } else if (i.RAM.equals(str)) {
                    notebookList.add(i);
                } else if (i.HDD.equals(str)) {
                    notebookList.add(i);
                } else if (i.OS.equals(str)) {
                    notebookList.add(i);
                }
            }
            return notebookList;
        }

        public static void main(String[] args) {
            System.out.println("Добро пожаловать в магазин ноутбуков! ");
            System.out.println(
                    "Выберите действие: \n Нажмите 1, чтобы распечатать все товары; \n Нажмите 2 для поиска по каталогу; \n Нажмите 0 для выхода из магазина.");

            Scanner iScanner = new Scanner(System.in, "cp866");
            int userInput = iScanner.nextInt();

            HashSet<Notebook> notebookSet = new HashSet<Notebook>();

            Notebook notebook_1 = new Notebook(12345, "ASUS", "ASUS X515EA-BQ1461W", "8GB", "256GB",
                    "Windows11", 36069);
            Notebook notebook_2 = new Notebook(23456, "Apple", "Apple MacBook Air 13 2022", "8GB", "256GB",
                    "macOS", 94990);
            Notebook notebook_3 = new Notebook(34567, "Acer", "Acer Aspire 7 A715-42G-R427", "16GB", "512GB",
                    "Windows11", 92134);
            Notebook notebook_4 = new Notebook(45678, "Dell", "Dell Alienware M15 R5", "16GB", "1TB",
                    "Windows11", 159000);

            notebookSet.add(notebook_1);
            notebookSet.add(notebook_2);
            notebookSet.add(notebook_3);
            notebookSet.add(notebook_4);

            switch (userInput) {
                case 1:
                    for (Notebook i : notebookSet) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    System.out.println(
                            "Введите цифру, соответствующую критерию поиска: \n 1 - производитель \n 2 - объем RAM \n 3 - объем HDD \n 4 - операционная система");
                    int usersInput = iScanner.nextInt();
                    switch (usersInput) {
                        case 1:
                            System.out.println("Введите название производителя(Asus/Apple/Acer/Dell):");
                            String manufacturerInput = iScanner.next();
                            List<Notebook> queryNotebook = notebook_4.findNotebook(notebookSet, manufacturerInput);
                            for (Notebook i : queryNotebook) {
                                System.out.println(
                                        "Ноутбук производителя = " + manufacturerInput + ": \n" + i.toString());
                            }
                            break;
                        case 2:
                            System.out.println("Введите RAM ноутбука(8GB/16GB):");
                            String RAMInput = iScanner.next();
                            List<Notebook> queryNotebook2 = notebook_4.findNotebook(notebookSet, RAMInput);
                            for (Notebook i : queryNotebook2) {
                                System.out.println("Ноутбук с RAM = " + RAMInput + ": \n" + i.toString());
                            }
                            break;
                        case 3:
                            System.out.println("Введите HDD ноутбука(256GB/512GB/1TB):");
                            String HDDInput = iScanner.next();
                            List<Notebook> queryNotebook3 = notebook_4.findNotebook(notebookSet, HDDInput);
                            for (Notebook i : queryNotebook3) {
                                System.out.println("Ноутбук с HDD = " + HDDInput + ": \n" + i.toString());
                            }
                            break;
                        case 4:
                            System.out.println("Введите операционную систему ноутбука(MacOS/Windows11):");
                            String OSInput = iScanner.next();
                            List<Notebook> queryNotebook4 = notebook_4.findNotebook(notebookSet, OSInput);
                            for (Notebook i : queryNotebook4) {
                                System.out.println(
                                        "Ноутбук с операционной системой = " + OSInput + ": \n" + i.toString());
                            }
                            break;
                    }
                case 0:
                    break;
                default:
                    System.out.println("Извините, такой операции нет");
                    return;
            }
            iScanner.close();
        }
    }
}
