public class forloop_breakex {
    public static void main(String args[]){
        int alreadytaken_number=20;
        for(int userdefined_number=0;userdefined_number<alreadytaken_number;userdefined_number++)
        {
          System.out.println("After execution the number is: "+userdefined_number);
          if(userdefined_number==5)
        {
            System.out.println("break was held");
            break;
        }
        }   
      
}
}
