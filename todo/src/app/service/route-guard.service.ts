import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { HardcodedAuthenticationService } from './hardcoded-authentication.service';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class RouteGuardService implements CanActivate {

  constructor(
    private hardCodedAuthenticationService: HardcodedAuthenticationService,
    private router: Router) { 

    }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    if(this.hardCodedAuthenticationService.isUserLoggedIn())
    return true;

    this.router.navigate(['login']);
    return false;
  }
}
