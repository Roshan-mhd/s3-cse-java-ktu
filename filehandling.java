import java.io.*;
public class filehandling{
  public static void main(String[]args) throws Exception{
      try{File inf = new File("in.dat");   
      File outf = new File("out.dat");
      FileReader ins = new FileReader(inf);    
      FileWriter outs = new FileWriter(outf);
      int ch;
      while((ch=ins.read()) != -1){
      outs.write(ch);
      }
      if(outs != null)
        System.out.println("\n Content written Successfully");
      ins.close();
      outs.close();
    }catch(FileNotFoundException e){
      System.out.println("File not present is same folder");
  }catch(Exception e){
    System.out.println("Error occured");
  }
}
}
//create a file in.dat and add any text there and also create out.dat