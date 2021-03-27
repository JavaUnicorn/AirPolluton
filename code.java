import java.net.*;
import java.io.*;

public class code{
  public static void main(String[] args) throws Exception{
  URL oracle = new URL("https://opendap.nccs.nasa.gov/dods/gmao/geos-cf/assim/chm_inst_1hr_g1440x721_p23");

  BufferedReader in = new BufferedReader(
    new InputSteamReader(oracle.openStream()));
  
  String inputLine;
  while ((inputLine = in.readLine()) != null){
    System.out.print(inputLine);
    in.close();
  }
 
  }
}