package com.example.dabagiretermonebackend.controllers;

import com.example.dabagiretermonebackend.dtos.DoMathRequest;
import com.example.dabagiretermonebackend.utils.CalcResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MathControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testDoMathAddition() throws Exception {
        DoMathRequest request = new DoMathRequest(1,2,"+");

        CalcResponse response = restTemplate.postForObject("/api/v1/do-math", request, CalcResponse.class);
        System.out.println(response);

        JSONAssert.assertEquals("{\"calcResponse\":3.0}", String.valueOf(response), false);
        assert response.getCalcResponse() == 3.0;
    }

    @Test
    public void testDoMathSubtraction() throws Exception {
        DoMathRequest request = new DoMathRequest(1,2,"-");

        CalcResponse response = restTemplate.postForObject("/api/v1/do-math", request, CalcResponse.class);
        System.out.println(response);

        JSONAssert.assertEquals("{\"calcResponse\":-1.0}", response.toString(), false);
    }

    @Test
    public void testDoMathMultiplication() throws Exception {
        DoMathRequest request = new DoMathRequest(1,2,"*");

        CalcResponse response = restTemplate.postForObject("/api/v1/do-math", request, CalcResponse.class);
        System.out.println(response);

        JSONAssert.assertEquals("{\"calcResponse\":2.0}", response.toString(), false);
    }

    @Test
    public void testDoMathDivision() throws Exception {
        DoMathRequest request = new DoMathRequest(1,2,"/");

        CalcResponse response = restTemplate.postForObject("/api/v1/do-math", request, CalcResponse.class);
        System.out.println(response);

        JSONAssert.assertEquals("{\"calcResponse\":0.5}", response.toString(), false);
    }


    @Test
    public void testDoMathInvalidOperator() throws Exception {
        DoMathRequest request = new DoMathRequest(1,2,"^");

        CalcResponse response = restTemplate.postForObject("/api/v1/do-math", request, CalcResponse.class);
        System.out.println(response);

        JSONAssert.assertEquals("{\"calcResponse\":0.0}", response.toString(), false);
    }

}
