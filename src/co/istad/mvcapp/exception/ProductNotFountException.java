package co.istad.mvcapp.exception;

public class ProductNotFountException extends Exception{
    public ProductNotFountException(){
        super();
    }
    public ProductNotFountException(String massage){
        super(massage);
    }
}
