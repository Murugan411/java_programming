public class fcb5
{
    public static void main(String[] args) 
    {
        System.out.println("Vowels:");
        for(int i='A';i<='Z';i++)
        {
            if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U')
            {
                System.out.print((char)i);
            }
        }
        System.out.println("\n");
        System.out.println("Consonants:");
        for(int i='A';i<='Z';i++){
            if(!(i=='A'||i=='E'||i=='I'||i=='O'||i=='U')){
                System.out.print((char)i);
            }
        }
    }
}
