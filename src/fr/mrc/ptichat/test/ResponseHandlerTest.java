package fr.mrc.ptichat.test;

import fr.mrc.ptichat.main.processing.ResponseHandler;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResponseHandlerTest {

    private ResponseHandler rh = new ResponseHandler();

    @Test
    public void getTerminationBytes() throws Exception {
        assertArrayEquals("Q".getBytes() , rh.getTerminationBytes());
    }

    @Test
    public void formatMessage() throws Exception {
        assertArrayEquals("M".getBytes() , rh.formatMessage(null));
        assertArrayEquals("Mtoto".getBytes() , rh.formatMessage("toto"));
    }

}