import control.TiendaFecher;

public class Main {
    public static void main(String[] args) {
        try {
            String urlApi = "https://jsonplaceholder.typicode.com/posts";
            String respuesta = TiendaFecher.obtenerProducto(urlApi);

        for (int i = 0; i < respuesta.length(); i++) {
                
            if (respuesta.charAt(i) == '{') {

            for (int j = i; j < respuesta.length(); j++) {
                if (respuesta.charAt(j) == '9' && respuesta.charAt(j+1) == '9') {
                    for (int k = i; k < respuesta.length(); k++) {
                        System.out.print(respuesta.charAt(k));
                            if (respuesta.charAt(k) == '}') {
                                System.out.println("");
                                break;
                                }
                            }
                            break;
                }
            if (respuesta.charAt(j) == '}') {
                break;
            }
        }
    }
    
}
    } catch (Exception e) {
        
        }
    }
}
