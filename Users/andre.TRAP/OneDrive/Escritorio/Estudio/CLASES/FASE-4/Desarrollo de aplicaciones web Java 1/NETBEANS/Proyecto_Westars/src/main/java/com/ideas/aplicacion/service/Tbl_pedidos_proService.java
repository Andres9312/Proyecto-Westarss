
package com.ideas.aplicacion.service;


import com.ideas.aplicacion.domain.Tbl_pedidos_pro;
import java.util.List;


public interface Tbl_pedidos_proService {
    public List<Tbl_pedidos_pro> listarTbl_pedidos_pro();
    public List<Tbl_pedidos_pro> buscarPorNombre(Tbl_pedidos_pro tbl_pedidos_pro);
    public Tbl_pedidos_pro  encontrar(Tbl_pedidos_pro tbl_pedidos_pro);
    public void guardar(Tbl_pedidos_pro tbl_pedidos_pro);
    public void eliminar(Tbl_pedidos_pro tbl_pedidos_pro);
    
}
