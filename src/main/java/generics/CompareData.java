package generics;

public class CompareData<T> {

    public String compare(T var1, T var2){
        if(var1 == var2)
            return "Equals";
        else return "No equals";
    }
}
