# rest-soap-tsl-ssl-ornekleri
Https üzerinden TSL destekli REST-SOAP örnekleri

Spring Boot 2.0 kullanılarak oluşturulmuştur.

Endpointler REST:

https://localhost:8099/getAllUsers ---> Sistemdeki kullanıcıların tamamını getirir.Get metodu kullanır.

https://localhost:8099/findUser/{id} --> Sistemden girilen id ye sahip kullanıcıyı getirir.3 tane kullanıcı vardır default olarak.Id numaraları 1-2-3 tür.Get metodu ile çalışır.

https://localhost:8099/createUser --> Gönderilen request body'sindeki verilere göre kullanıcı ekler.Post metodu ile çalışır.getAllUsers url'i ile kullanıcıları çağırıp örnek kullanıcı bilgilerine göre bu metodu kullanabilirsiniz.

https://localhost:8099/deleteUser/{id}--> Girilen id numarasına göre ilgili kullanıcıyı siler.Delete metodu ile çalışır.

https://localhost:8099/updateUser --> Body ile gönderilen değerlere göre kullanıcı bilgilerini günceller.Put metodu kullanır.

Endpointler SOAP:

https://localhost:8099/ws/states.wsdl --> WSDL dosyasını içerir.


