import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

export class User{
  constructor(
    public id: number,
    public name: String,
    public surname: String,
  ){}
}


@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor( private httpClient:HttpClient) { }

  public getUsers()  {
    // console.log("test call");
    return this.httpClient.get<User[]>(`http://localhost:8080/api`);
  }
}
