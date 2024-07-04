import { Injectable } from "@angular/core";
import { Customer } from "./customer";
import { Observable } from "rxjs";
 import { HttpClient } from "@angular/common/http";
//import { appConfig } from "./app.config";


@Injectable({
    providedIn:'root'
})
export class CustomerService{
    private apiServerURL ="http://localhost:8080";
    constructor(private http: HttpClient){}
    public addCustomer(customer: Customer): Observable<Customer>{
        return this.http.post<Customer>(`${this.apiServerURL}/customer/createcustomer`, customer);
    }
}