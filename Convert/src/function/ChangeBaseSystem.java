package function;

public class ChangeBaseSystem {

    public String convert(int baseInput, int baseOutput, String value) {
        String result = "";
        switch (baseOutput) {
            case 1:
                result = convertToBinary(baseInput, value);
                break;
            case 2:
                result = convertToDecimal(baseInput, value);
                break;
            case 3:
                result = convertToHexa(baseInput, value);
                break;
        }
        return result;
    }

    public String convertToBinary(int baseInput, String value) {
        String result = "";
        switch (baseInput) {
            case 1:
                result = value;
                break;
            case 2:
                result = Integer.toBinaryString(Integer.parseInt(value));
                break;
            case 3:
                result = Integer.toBinaryString(Integer.parseInt(value,16));
                break;
        }
        return result;
    }
    
    public String convertToDecimal(int baseInput, String value) {
        String result = "";
        switch (baseInput) {
            case 1:
                result = String.valueOf(Integer.parseInt(value, 2));
                break;
            case 2:
                result = value;
                break;
            case 3:
                result = String.valueOf(Integer.parseInt(value, 16));
                break;
        }
        return result;
    }
    
    public String convertToHexa(int baseInput, String value) {
        String result = "";
        switch (baseInput) {
            case 1:
                result = Integer.toHexString(Integer.parseInt(value,2));
                break;
            case 2:
                result = Integer.toHexString(Integer.parseInt(value));
                break;
            case 3:
                result = value;
                break;
        }
        return result.toUpperCase();
    }
}
