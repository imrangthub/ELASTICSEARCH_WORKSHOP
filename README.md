# ELASTICSEARCH_WORKSHOP


 Download Elasticsearch & Kibana, then unzip both.





Start Elasticsearch adn Kebana:
-----------------------------------

InBin 

  =>elasticsearch.bat


       {
       name: "MeFFoA6",
       cluster_name: "imran-cster-spring-boot-crud-app",
       cluster_uuid: "6n_qAluMRxC0ezZGODEBwg",
       version: {
       number: "6.5.1",
       build_flavor: "default",
       build_type: "zip",
       build_hash: "8c58350",
       build_date: "2018-11-16T02:22:42.182257Z",
       build_snapshot: false,
       lucene_version: "7.5.0",
       minimum_wire_compatibility_version: "5.6.0",
       minimum_index_compatibility_version: "5.0.0"
       },
       tagline: "You Know, for Search"
       }
       
       
  =>kibana.bat
  
  


Elasticsearch:
------------------------

  =>http://localhost:9200/.
  
  =>http://localhost:9200/_cluster/health?pretty
  
  =>http://localhost:9200/_cluster/pending_tasks
  
  =>http://localhost:9200/_cluster/stats?human&pretty
    
  =>http://localhost:9200/_cluster/settings?include_defaults=true&flat_settings=true
  
  
  =>http://localhost:9200/school_indx/_mappings
  
  
  
  
  
Kibana: 
----------------------------------------

  =>http://localhost:5601/.

  =>http://127.0.0.1:5601/app/home#/

  =>http://localhost:5601/app/kibana#/dashboard/Metricbeat-system-overview-ecs
  
  
  
  
EL Operation
============================


List of Index

      =>GET /_cat/indices?v
     
     
Creae a index

      =>PUT employee_indx


Add data to Index

      =>POST employee_indx/_doc/1
      {
         "name":"MD IMRAN HOSSAIN", "gender":"Male",
         "age":"30", "city":"Dhaka"
      }
      
      =>PUT /student_indx
       {
         "settings": {
           "number_of_shards": 1
         },
         "mappings": {
           "properties": {
             "name": { "type": "text" },
             "age": { "type": "integer" },
             "gender": { "type": "text" }
           }
         }
       }
       

Show Index date

      =>GET employee_indx/_doc/1
      =>POST /employee_indx/_search
      =>POST /employee_indx/_search?filter_path=hits.hits
     
     
Update:

      =>POST /employee_indx/_doc/1/_update
       {
         "doc": {
         "name": "MD IMRAN HOSSAIN UPDATE"
         }
       }
  DeleteDate    
  
      =>DELETE  employee_indx/_doc/11


