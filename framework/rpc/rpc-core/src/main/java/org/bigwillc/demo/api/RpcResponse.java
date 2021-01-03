package org.bigwillc.demo.api;

/**
 * custom response struct
 *
 * @author bigwillc
 **/
public class RpcResponse {

    /**
     * result of response.
     */
    private Object result;

    /**
     * status of response.
     */
    private Boolean status;

    /**
     * exception information of response.
     */
    private Exception exception;

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }
}
