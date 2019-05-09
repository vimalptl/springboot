package com.vmx.h2manage.repository;

import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.SqlResultSetMapping;

import com.vmx.h2manage.payload.LabelValueResponse;

@Repository
public class CommonRepository  {

    @PersistenceContext
    private EntityManager entityManager;


        public List<String> countryList() {
            Query q =  (Query) entityManager.createNativeQuery("SELECT COUNTRY_NAME FROM COUNTRY");
            List<String> strs = q.getResultList();
            return strs;
        }   

        // @SqlResultSetMapping(name="LabelValueResponse", classes = @ConstructorResult(targetClass = LabelValueResponse.class,
        // columns = {@ColumnResult(name="label"), @ColumnResult(name="value")}));

        public List<LabelValueResponse> stateList() {

            Query q =  (Query) entityManager.createNativeQuery("SELECT STATE_NAME AS label,STATE_ABBR AS value FROM STATE");
            List<Object[]> lvs = q.getResultList();
            List<LabelValueResponse> listLV = new ArrayList<LabelValueResponse>();
            lvs.stream().forEach(a -> listLV.add(new LabelValueResponse((String)a[0] , (String)a[1])));
            return listLV;
        }   

        // @Query(
        //     value = "SELECT STATE_NAME as label,STATE_ABBR as value FROM STATE", 
        //     nativeQuery = true)
        //     List<LabelValueResponse> statesList();
    



}
