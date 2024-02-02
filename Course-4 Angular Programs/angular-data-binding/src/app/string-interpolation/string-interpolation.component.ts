import { Component } from '@angular/core';

@Component({
  selector: 'app-string-interpolation',
  templateUrl: './string-interpolation.component.html',
  styleUrls: ['./string-interpolation.component.css']
})
export class StringInterpolationComponent {

  name:string ="Sweety"

  sayHello(name:string ): string{
    return "Welcome user "+name;
  }
}
