import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

export class User{
  constructor(
    public id: string,
    public name: string,
    public surname: string,
  ){}
}


@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor( private httpClient:HttpClient) { }

  public getUsers()  {
    return this.httpClient.get<User[]>(`http://localhost:8080/api`);
  }

  public deleteUser(user: User){
    return this.httpClient.delete<User>(`http://localhost:8080/api` +`/` +  user.id);
  }

  public createUser(user: User){
    return this.httpClient.post<User>(`http://localhost:8080/api`,  user);
  }

}
