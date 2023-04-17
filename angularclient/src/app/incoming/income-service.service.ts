import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class IncomeServiceService {

  private serverAdress='localhost:8080/incomings';

  constructor(private http: HttpClient) {}

  saveIncome(Income: object): Observable<object>{
    return this.http.post(this.serverAdress, Income);
}


}
