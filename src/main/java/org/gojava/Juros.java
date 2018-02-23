package org.gojava;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/juros")
@Produces(MediaType.APPLICATION_JSON)
public class Juros {

  private final Map<String, BigDecimal> juros = new HashMap<>();

  public Juros() {
    juros.put("DIZIMO", BigDecimal.valueOf(10d));
    juros.put("AMA", BigDecimal.valueOf(1.5d));
    juros.put("POR DIA", BigDecimal.valueOf(0.08d));
    juros.put("NOVO", BigDecimal.ONE);
  } 

  @GET
  @Path("/lista")
  public Map<String, BigDecimal> lista() {
    return juros;
  }

  @GET
  @Path("/lista/{id}")
  public Response obterJurosPorId(@PathParam("id") String id) {
    return Response.ok(juros.getOrDefault(id, BigDecimal.ZERO)).build();
  }
  
}