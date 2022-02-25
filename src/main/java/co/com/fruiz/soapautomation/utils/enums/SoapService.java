package co.com.fruiz.soapautomation.utils.enums;

public enum SoapService {
    BASE_URL(uri:"http://www.dneonline.com/"),
    ADD_NUMBERS(uri:"calculator.asmx");

    private String uri;


    SoapService(String uri){
        this.uri=uri;
    }

    @Override
    public String toString() {return uri;}
}
