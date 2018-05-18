package com.example.admin.testsoapparsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.admin.testsoapparsing.interactor.model.Data;
import com.example.admin.testsoapparsing.network.ApiClient;
import com.example.admin.testsoapparsing.network.ApiInterface;
import com.example.admin.testsoapparsing.network.model.request.ADLoginRequest;
import com.example.admin.testsoapparsing.network.model.request.DataRequestBody;
import com.example.admin.testsoapparsing.network.model.request.ModelCRUDRequest;
import com.example.admin.testsoapparsing.network.model.request.RequestData;
import com.example.admin.testsoapparsing.network.model.request.RequestEnvelope;
import com.example.admin.testsoapparsing.network.model.response.DataRow;
import com.example.admin.testsoapparsing.network.model.response.FieldDataResponse;
import com.example.admin.testsoapparsing.network.model.response.ResponseEnvelope;
import com.example.admin.testsoapparsing.network.model.response.WindowTabData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiateService();

    }

    private void initiateService() {
        RequestEnvelope envelope = new RequestEnvelope();

        DataRequestBody body = new DataRequestBody();

        final RequestData data = new RequestData();

        ModelCRUDRequest modelCRUDRequest = new ModelCRUDRequest();

        ADLoginRequest loginRequest = new ADLoginRequest();

        //TODO set all available data's here
        loginRequest.setClientID(1000000);
        loginRequest.setUser("SuperUser");
        loginRequest.setPass("System");
        loginRequest.setLang("en_US");
        loginRequest.setRoleID(1000000);
        loginRequest.setOrgID(1000000);
        loginRequest.setWarehouseID(1000004);
        loginRequest.setStage(0);


        modelCRUDRequest.setLoginRequest(loginRequest);
        modelCRUDRequest.setModelCRUD();


        data.setCduRequest(modelCRUDRequest);
        body.setUsStatesRequestData(data);
        envelope.setBody(body);


        Call<ResponseEnvelope> call = ApiClient.getApiClient().create(ApiInterface.class).fetchData(envelope);

        call.enqueue(new Callback<ResponseEnvelope>() {
            @Override
            public void onResponse(Call<ResponseEnvelope> call, Response<ResponseEnvelope> response) {
                Log.e("Sucess","Success");
             //   Data responseData = getParsedData(response.body().getBody().getData().getData());
            }

            @Override
            public void onFailure(Call<ResponseEnvelope> call, Throwable t) {
                Log.e("Sucess","Success");
            }
        });

       /* call.enqueue(new Callback<Response>() {

                         @Override
                         public void onResponse(Call<Response> call, Response<Response> response) {

                         }

                         @Override
                         public void onFailure(Call<Response> call, Throwable t) {

                         }
                     });*/
      /*  call.enqueue(new retrofit2.Callback<ResponseEnvelope>() {
            @Override
            public void onResponse(Call<ResponseEnvelope> call, final Response<ResponseEnvelope> response) {
                Log.e("Sucess","Success");
              //  Data responseData = getParsedData(response.body().getBody().getData().getData());

            }

            @Override
            public void onFailure(Call<ResponseEnvelope> call, Throwable t) {
                Log.e("Error",t.getMessage());
            }
        });*/

    }
    private Data getParsedData(WindowTabData tabData) {

        List rowList = new ArrayList();
        for (DataRow item : tabData.getDataSet().getDataRowList()) {
            Map<String,String> fetchedContent = new HashMap<>();
            for (FieldDataResponse mapItem : item.getFieldData()) {
                fetchedContent.put(mapItem.getColumn(),mapItem.getVal());
            }
            rowList.add(fetchedContent);
        }

        Data data = new Data();
        data.setNumRows(tabData.getNumRows());
        data.setRowCount(tabData.getRowCount());
        data.setStartRow(tabData.getStartRow());
        data.setTotalRows(tabData.getTotalRows());
        data.setSuccess(tabData.isSuccess());
        data.setDataSet(rowList);
        return data;
    }
}
