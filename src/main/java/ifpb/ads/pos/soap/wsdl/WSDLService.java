/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.pos.soap.wsdl;

import java.util.List;

/**
 *
 * @author Junior
 */
public class WSDLService {

    public static void main(String[] args) {
//       CidadesServiceService cidades = new CidadesServiceService().getCidadesWebService();
//        List<Estados> estados = cidades.getEstados();
//        estados.forEach(System.out::println);
        new CidadesServiceService().getCidadesWebService().getEstados().stream().forEach((estado) -> {
            System.out.println(estado.getEstado());
        });
    }

}
