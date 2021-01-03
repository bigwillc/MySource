package org.bigwillc.demo.api;

/**
 * custom request struct.
 *
 * @author bigwillc
 **/
public class RpcRequest {

    /**
     * service class name of request.
     */
    private String serviceClass;

    /**
     * method name of request.
     */
    private String method;

    /**
     * params of request.
     */
    private Object[] array;

    public String getServiceClass() {
        return serviceClass;
    }

    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }
}
