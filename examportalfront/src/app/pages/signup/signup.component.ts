import { UserService } from './../../services/user.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css'],
})
export class SignupComponent implements OnInit {
  constructor(
    private userService: UserService,
    private _snackBar: MatSnackBar
  ) {}

  ngOnInit(): void {}

  public user = {
    userName: '',
    password: '',
    firstName: '',
    lastName: '',
    email: '',
    phone: '',
  };

  formsubmit() {
    if (this.user.userName == '' || this.user.userName == null) {
      this._snackBar.open('Username is required', 'ok', {
        duration: 3000,
      });
    } else {
      this.userService.addUser(this.user).subscribe(
        (data) => {
          console.log(data);
          if (data == null || data.id == null) {
            this._snackBar.open('User Exists', 'ok', {
              duration: 3000,
            });
          }
        },
        (error) => {
          console.log(error);
          console.log('error', error);
        }
      );
    }
  }
}
