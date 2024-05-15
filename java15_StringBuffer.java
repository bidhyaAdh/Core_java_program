public class java15_StringBuffer {
        public static void main(String[] args)
        {
            //stringBuffer is thread safe
            StringBuffer sb = new StringBuffer("Bidhya");
            System.out.println(sb.length());
            sb.append(" Adhikari");
            sb.insert(0,"java ");
            sb.setLength(20);
            System.out.println(sb);

        }
}
