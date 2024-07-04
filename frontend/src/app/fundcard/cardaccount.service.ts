import { Injectable } from "@angular/core";
import { CardAccount } from "./cardaccount";
import { Observable } from "rxjs";
 import { HttpClient } from "@angular/common/http";
//import { appConfig } from "./app.config";


@Injectable({
    providedIn:'root'
})
export class CardAccountService{
    private apiServerURL ="http://localhost:8080";
    constructor(private http: HttpClient){}
    public createfund(cardaccount: CardAccount): Observable<CardAccount>{
        return this.http.post<CardAccount>(`${this.apiServerURL}/cardaccount/fundaccount`, cardaccount);
    }
}