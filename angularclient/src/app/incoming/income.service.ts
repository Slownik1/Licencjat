import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Income } from './income';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class IncomeService {

  private localUrl: string;
  constructor(private http: HttpClient) {

    this.localUrl='http://localhost:8080/incomings';

  }

  public findAll(): Observable<Income[]> {
    return this.http.get<Income[]>(this.localUrl);
  }

  public save(income: Income): Observable<object> {
    return this.http.post<Income>(this.localUrl, income);
  }
}
