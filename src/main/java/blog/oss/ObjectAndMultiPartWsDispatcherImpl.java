package blog.oss;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
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

        //putObject copyObject putObjectAcl
        //uploadPart uploadPartCopy

        List<PathSegment> dirList = uriInfo.getPathSegments();

        //get query

        List<String> acl = queryParameters.get("acl");
        List<String> uploadId = queryParameters.get("uploadId");
        List<String> partNumber = queryParameters.get("partNumber");

        if (partNumber == null) {
            //Object
            if (acl == null) {
                //get header

                List<String> xOssCopySource = httpHeaders.getRequestHeader("x-oss-copy-source");
                if (xOssCopySource == null) {
                    //putObject

                    //get header
                    List<String> host = httpHeaders.getRequestHeader("Host");
                    List<String> cacheControl = httpHeaders.getRequestHeader("Cache-Control");
                    List<String> contentDisposition = httpHeaders.getRequestHeader("Content-Disposition");
                    List<String> contentEncoding = httpHeaders.getRequestHeader("Content-Encoding");
                    List<String> contentMd5 = httpHeaders.getRequestHeader("Content-Md5");
                    List<String> contentLength = httpHeaders.getRequestHeader("Content-Length");
                    List<String> etag = httpHeaders.getRequestHeader("ETag");
                    List<String> expires = httpHeaders.getRequestHeader("Expires");
                    List<String> xOssServerSideEncryption = httpHeaders.getRequestHeader("x-oss-server-side-encryption");
                    List<String> xOssServerSideEncryptionKeyId = httpHeaders.getRequestHeader("x-oss-server-side-encryption-key-id");
                    List<String> xOssObjectAcl = httpHeaders.getRequestHeader("x-oss-object-acl");
                    List<String> xOssStorageClass = httpHeaders.getRequestHeader("x-oss-storage-class");

                    InputStream is = StringToInputStream(body);

                } else {
                    //copyObject

                    //get header
                    List<String> host = httpHeaders.getRequestHeader("Host");
                    List<String> xOssCopySourceIfMatch = httpHeaders.getRequestHeader("x-oss-copy-source-if-match");
                    List<String> xOssCopySourceIfNoneMatch = httpHeaders.getRequestHeader("x-oss-copy-source-if-none-match");
                    List<String> xOssCopySourceIfModifiedSince = httpHeaders.getRequestHeader("x-oss-copy-source-if-modified-since");
                    List<String> xOssCopySourceIfUnmodifiedSince = httpHeaders.getRequestHeader("x-oss-copy-source-if-unmodified-since");
                    List<String> xOssMetadataDirective = httpHeaders.getRequestHeader("x-oss-metadata-directive");
                    List<String> xOssServerSideEncryption = httpHeaders.getRequestHeader("x-oss-server-side-encryption");
                    List<String> xOssServerSideEncryptionKeyId = httpHeaders.getRequestHeader("x-oss-server-side-encryption-key-id");
                    List<String> xOssObjectAcl = httpHeaders.getRequestHeader("x-oss-object-acl");
                    List<String> xOssStorageClass = httpHeaders.getRequestHeader("x-oss-storage-class");
                    List<String> contentLength = httpHeaders.getRequestHeader("Content-Length");
                    List<String> expires = httpHeaders.getRequestHeader("Expires");


                }
            } else {
                //get header

                List<String> host = httpHeaders.getRequestHeader("Host");
                List<String> authorization = httpHeaders.getRequestHeader("Authorization");
                List<String> xOssObjectAcl = httpHeaders.getRequestHeader("x-oss-object-acl");
            }
        } else {
            //MultiPart

            //get header

            List<String> xOssCopySource = httpHeaders.getRequestHeader("x-oss-copy-source");
            if (xOssCopySource == null) {
                //uploadPart

                //get header
                List<String> host = httpHeaders.getRequestHeader("Host");
                List<String> contentMD5 = httpHeaders.getRequestHeader("Content-MD5");
                InputStream is = StringToInputStream(body);
            } else {
                //uploadPartCopy

                //get header
                List<String> host = httpHeaders.getRequestHeader("Host");
                List<String> xOssCopySourceRange = httpHeaders.getRequestHeader("x-oss-copy-source-range");
                List<String> xOssCopySourceIfMatch = httpHeaders.getRequestHeader("x-oss-copy-source-if-match");
                List<String> xOssCopySourceIfNoneMatch = httpHeaders.getRequestHeader("x-oss-copy-source-if-none-match");
                List<String> xOssCopySourceIfModifiedSince = httpHeaders.getRequestHeader("x-oss-copy-source-if-modified-since");
                List<String> xOssCopySourceIfUnmodifiedSince = httpHeaders.getRequestHeader("x-oss-copy-source-if-unmodified-since");
            }
        }

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
