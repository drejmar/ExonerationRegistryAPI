package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CasesApiService;
import io.swagger.api.factories.CasesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;
import io.swagger.model.ExonerationCaseDetail;
import io.swagger.model.ExonerationCaseCount;
import io.swagger.model.ExonerationCaseSummary;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/cases")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the cases API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-29T20:39:44.895Z")
public class CasesApi  {
   private final CasesApiService delegate = CasesApiServiceFactory.getCasesApi();

    @GET
    @Path("/{caseID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Exoneration Case Detail", notes = "The Exoneration Case Detail endpoint.\n", response = ExonerationCaseDetail.class, tags={ "Exonerations",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Exoneration case detail", response = ExonerationCaseDetail.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ExonerationCaseDetail.class) })
    public Response casesCaseIDGet(
        @ApiParam(value = "Unique exoneration case identifier.",required=true) @PathParam("caseID") String caseID,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.casesCaseIDGet(caseID,securityContext);
    }
    @GET
    @Path("/count")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Exoneration Case Count", notes = "The Exoneration Case Count endpoint.\n", response = ExonerationCaseCount.class, tags={ "Exonerations",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Exoneration case count", response = ExonerationCaseCount.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ExonerationCaseCount.class) })
    public Response casesCountGet(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.casesCountGet(securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Exoneration Case Summary List", notes = "The Exoneration Case Summary List endpoint.\n", response = ExonerationCaseSummary.class, responseContainer = "List", tags={ "Exonerations" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of exoneration cases", response = ExonerationCaseSummary.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ExonerationCaseSummary.class, responseContainer = "List") })
    public Response casesGet(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.casesGet(securityContext);
    }
}
