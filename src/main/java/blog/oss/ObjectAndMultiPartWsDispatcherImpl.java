package blog.oss;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.ws.Response;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectAndMultiPartWsDispatcherImpl implements ObjectAndMultiPartWsDispatcher {
    @Override
    public Response put(String objectName, UriInfo uriInfo, HttpHeaders httpHeaders, String body) {
        URI absolutePath = uriInfo.getAbsolutePath();
        URI baseUri = uriInfo.getBaseUri();
        List<Object> matchedResources = uriInfo.getMatchedResources();
        List<String> matchedURIs = uriInfo.getMatchedURIs();
        String path = uriInfo.getPath();
        MultivaluedMap<String, String> pathParameters = uriInfo.getPathParameters();
        MultivaluedMap<String, String> queryParameters = uriInfo.getQueryParameters();
        return null;
    }

    @Override
    public Response post(String objectName, UriInfo uriInfo, HttpHeaders httpHeaders, String body) {
        return null;
    }

    @Override
    public Response get(String objectName, UriInfo uriInfo, HttpHeaders httpHeaders, String body) {
        return null;
    }

    @Override
    public Response head(String objectName, UriInfo uriInfo, HttpHeaders httpHeaders, String body) {
        return null;
    }

    @Override
    public Response delete(String objectName, UriInfo uriInfo, HttpHeaders httpHeaders, String body) {
        return null;
    }

    private static Map<String, String> splitQueryToList(String query) {

        Map<String, String> queryParam = new HashMap<>();

        //example
        //query = append&position=0

        String[] split = query.split("&");

        //split[0] = append
        //split[1] = position=0

        for (int i = 0; i < split.length; i++) {
            String[] keyAndValue = split[i].split("=");
            if (keyAndValue.length == 1) {
                queryParam.put(keyAndValue[0], "");
            } else {
                queryParam.put(keyAndValue[0], keyAndValue[1]);
            }
        }

        return queryParam;
    }

    private static InputStream StringToInputStream(String body){
        ByteArrayInputStream is = new ByteArrayInputStream(body.getBytes());
        return is;
    }

    private static Object xmlToBean(String xmlPath,Class<?> load) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(load);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object object = unmarshaller.unmarshal(new File(xmlPath));
        return object;
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2019-01-28 17:10
 **/
