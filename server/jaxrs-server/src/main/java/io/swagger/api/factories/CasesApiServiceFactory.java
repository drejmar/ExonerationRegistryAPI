package io.swagger.api.factories;

import io.swagger.api.CasesApiService;
import io.swagger.api.impl.CasesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-29T20:39:44.895Z")
public class CasesApiServiceFactory {

   private final static CasesApiService service = new CasesApiServiceImpl();

   public static CasesApiService getCasesApi()
   {
      return service;
   }
}
