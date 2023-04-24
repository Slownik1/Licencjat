import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Outcome } from './outcome';

@Injectable()
export class OutgoingService {

  private usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/outcomes';
  }

  public save(outcome: Outcome) {
    return this.http.post<Outcome>(this.usersUrl, outcome);
  }
}