package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-29T20:39:44.895Z")
public abstract class CasesApiService {
  
      public abstract Response casesCaseIDGet(String caseID,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response casesCountGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response casesGet(SecurityContext securityContext)
      throws NotFoundException;
  
}
