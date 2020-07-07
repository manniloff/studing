package problem_solving.invert;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {
        Float[] data = {12.3f,123.4f,1.3f};
        Invertion invertion = new Invertion();

        invertion.invert(data);

        String hello = "Hello";
        System.out.println(hello);
    }
}
