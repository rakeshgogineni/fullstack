- create typescript files with.ts extension

```ts
export const products = [
   {
      id:1,
      name:'Thinking Fast and Slow',
      price:1599
   },
      {
      id:2,
      name:'The Monk Who Sold His Ferrari!',
      price:699
   },
];
```

```java
foreach (product : products){
   System.out.println(product.name);
}
```
```js
// LOOPING THROUGH THE PRODUCTS ARRAY
<div *ngFor = "let product of products">
// STRING INTERPOLATION
{{product.name}}
</div>
}
```

String INTERPOLATION
```ts
{{product.name}}
```

Property Binding 
[] 
```html
<a [title] = "product.name + ' details.'">
  {{product.name}}
</a>
```

Event Binding ()

```java
@Annotation
class Test{
}
```
```ts
@Decorator
class Test{

}
```

```ts
@Component({
   selector:'app-product-alerts',
   templateUrl:'./product-alerts.component.html',
   styleURLs:['./product-alerts.component.css']
})
class ProductAlertsComponent {

}
```

```java
import java.util.List;
```
```ts
import {List} from '@angular/core';
```


