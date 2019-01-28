package blog.oss;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.UriInfo;
import javax.xml.ws.Response;

public interface ObjectAndMultiPartWsDispatcher {

    @PUT
    @Path("/{objectName}")
    public Response put(@PathParam("objectName") String objectName, @Context UriInfo uriInfo, @Context HttpHeaders httpHeaders, String body);

    @POST
    @Path("/{objectName}")
    public Response post(@PathParam("objectName") String objectName, @Context UriInfo uriInfo,@Context HttpHeaders httpHeaders, String body);


    @GET
    @Path("/{objectName}")
    public Response get(@PathParam("objectName") String objectName, @Context UriInfo uriInfo,@Context HttpHeaders httpHeaders, String body);


    @HEAD
    @Path("/{objectName}")
    public Response head(@PathParam("objectName") String objectName, @Context UriInfo uriInfo,@Context HttpHeaders httpHeaders, String body);


    @DELETE
    @Path("/{objectName}")
    public Response delete(@PathParam("objectName") String objectName, @Context UriInfo uriInfo,@Context HttpHeaders httpHeaders, String body);
}
