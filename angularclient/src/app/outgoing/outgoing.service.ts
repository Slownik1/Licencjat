import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Outcome } from './outcome';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OutgoingService {

  private localUrl: string;

  constructor(private http: HttpClient) {
    this.localUrl = 'http://localhost:8080/outgoings';
  }

  public findAll(): Observable<Outcome[]> {
    return this.http.get<Outcome[]>(this.localUrl);
  }

  public save(outcome: Outcome) {
    return this.http.post<Outcome>(this.localUrl, outcome);
  }
}