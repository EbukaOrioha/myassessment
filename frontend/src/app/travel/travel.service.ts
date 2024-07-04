import { Injectable } from "@angular/core";
import { Travel } from "./travel";
import { Observable } from "rxjs";
 import { HttpClient } from "@angular/common/http";
//import { appConfig } from "./app.config";


@Injectable({
    providedIn:'root'
})
export class TravelService{
    private apiServerURL ="http://localhost:8080";
    constructor(private http: HttpClient){}
    public journey(travel: Travel): Observable<Travel>{
        return this.http.post<Travel>(`${this.apiServerURL}/cardaccount/fundaccount`, travel);
    }
}