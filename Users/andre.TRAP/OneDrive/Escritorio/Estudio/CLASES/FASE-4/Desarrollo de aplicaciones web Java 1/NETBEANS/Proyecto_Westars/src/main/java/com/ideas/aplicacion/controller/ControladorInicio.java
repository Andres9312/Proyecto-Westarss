
package com.ideas.aplicacion.controller;



import com.ideas.aplicacion.domain.Tbl_pedidos_pro;
import com.ideas.aplicacion.service.Tbl_pedidos_proServicelmpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;    
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ControladorInicio {
    
    ///////////////////////////////////////MODULO DE PROVEEDORES///////////////////////////////////////////////////
        
         //////////////PEDIDOS PROVEEDOR///////////////////////// 
    
    @Autowired  
    private Tbl_pedidos_proServicelmpl tbl_pedidos_proServiceImpl;
 
    @GetMapping("/")
     public String Inicio(Model model){
         
       
        
    return "/Index";
    }
    
    
    
    
    
    @GetMapping("/consultar")
    public String consultarTabla(Model model, Tbl_pedidos_pro tbl_pedidos_pro){
         
        System.out.println(tbl_pedidos_proServiceImpl.listarTbl_pedidos_pro());  

       List<Tbl_pedidos_pro> lstTbl_pedidos_pro = tbl_pedidos_proServiceImpl.listarTbl_pedidos_pro();
       model.addAttribute("lstTbl_pedidos_pro",lstTbl_pedidos_pro);
        
    return "CoPedido";
    }
    
     @GetMapping("/registrar")
    public String registrtarView(Model model, Tbl_pedidos_pro tbl_pedidos_pro){
        List<Tbl_pedidos_pro> lstTbl_pedidos_pro = tbl_pedidos_proServiceImpl.listarTbl_pedidos_pro();
       
       model.addAttribute("lstTbl_pedidos_pro", lstTbl_pedidos_pro);
       
     

       return"CoProveedor";
    }
    
     @PostMapping("/guardar")
    public String guardarAction(Model model, Tbl_pedidos_pro tbl_pedidos_pro){
        
       tbl_pedidos_proServiceImpl.guardar(tbl_pedidos_pro);

       return"redirect:";
       
    }
    
   @GetMapping("/editar/{idtbl_pedidos_pro}")
    public String editar(Tbl_pedidos_pro tbl_pedidos_pro, Model model) {
        tbl_pedidos_pro = tbl_pedidos_proServiceImpl.encontrar(tbl_pedidos_pro);
        
      
        model.addAttribute("tbl_pedidos_pro", tbl_pedidos_pro);

        return "RePedido";
    }
    
     @GetMapping("/eliminar")
    public String eliminarView(Model model, Tbl_pedidos_pro tbl_pedidos_pro){
        List<Tbl_pedidos_pro> lstTbl_pedidos_pro = tbl_pedidos_proServiceImpl.listarTbl_pedidos_pro();
        model.addAttribute("lstTbl_pedidos_pro", lstTbl_pedidos_pro);
        return "CoPedido";
    }
    
    @GetMapping("/eliminar/{idtbl_pedidos_pro}")
    public String eliminar(Tbl_pedidos_pro tbl_pedidos_pro){
        tbl_pedidos_proServiceImpl.eliminar(tbl_pedidos_pro);
        return "redirect:/";
    }
    
    
    
}
