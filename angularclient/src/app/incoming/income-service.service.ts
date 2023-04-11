import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Incoming} from "./incoming";

@Injectable({
  providedIn: 'root'
})
export class IncomeServiceService {

  private serverAdress='localhost:8080';

  constructor(private http: HttpClient) {}

  saveIncome(Income: object): Observable<object>{
    return this.http.post('${this.serverAdress}'+'income', Income);
}


}
