public class IP {

    public static boolean isInteger(String s){
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException nfe){ return false;}
    }
    public static boolean checkIP(String ip) {
        try{
            if(!isInteger(String.valueOf(ip.charAt(0))) || !isInteger(String.valueOf(ip.charAt(ip.length()-1)))){return false;} //pas super élégant
            if(ip.charAt(0)=='0'){return false;}
            String[] blocks = ip.split("\\.");
            for(int i=0;i<=3;i++){ //On test en même temps si la chaîne est trop courte avec le try catch
                if(Integer.parseInt(blocks[i])>255 || Integer.parseInt(blocks[i])<0){return false;}
            }
            if(blocks.length>4){return false;} //4 car on a 3+1 blocks
            return true;
        }
        catch (Exception notIP){
            return false;
        }
    }

    public static void testCheckIP() {
        String[] validIp = {
            "127.0.0.1",
            "127.231.1.1",
            "1.2.3.4"
        };
        String[] invalidIp = {
            "12.2.3",
            "12.3.213.123.123",
            "1231.12.2.3",
            ".1.2.3",
            "1.2.3.",
            "1.2.3.4.",
            "1.2..3",
            "0.1.2.3"
        };

        for (String ip : validIp) {
            if (!checkIP(ip)) {
                System.out.println("erreur: " + ip);
            }
        }
        for (String ip : invalidIp) {
            if (checkIP(ip)) {
                System.out.println("erreur: " + ip);
            }
        }
    }

    public static void main(String[] args) {
        testCheckIP();
    }

}
