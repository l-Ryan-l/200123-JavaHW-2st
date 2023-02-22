// Task 1:
// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE
// этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
// Результат "select * from students where “name” = “Ivanov” and “country”=”Russia” …
public class Task1_SqlStringBuilder {
    public static void main(String[] args) {
        String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        StringBuilder sb = new StringBuilder();
        sb.append("select * from students where ");
        String[] arr = str.split(",");

        for (String s : arr) {
            String key = s.substring(s.indexOf("'") + 1, s.indexOf(":") - 1);
            String value = s.substring(s.indexOf(":") + 2, s.lastIndexOf("'"));
            if (!value.equals("null")) {
                sb.append(key + "=" + "'" + value + "'" + " and ");
            }
        }
        sb.delete(sb.length() - 5, sb.length());
        System.out.println(sb);

    }

}

