//Task 3:
// Дана json строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder,
// создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
public class Task3_ParseOutString {
    public static void main(String[] args) {
        String someString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},"
                + "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},"
                + "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        StringBuilder sb = new StringBuilder();
        String[] chunkedString = someString.split("\\{");

        for (int i = 1; i < chunkedString.length; i++) {
            String[] studentInfo = chunkedString[i].replace("}]","").split("\",\"");

            sb.append("Студент " + studentInfo[0].split(":")[1].replace("\"", "")
                    + " получил " + studentInfo[1].split(":")[1].replace("\"", "")
                    + " по предмету " + studentInfo[2].split(":")[1].replace("\"", "").replace("},", "") + ".\n");
        }

        System.out.println(sb.toString());
      



    }
}
