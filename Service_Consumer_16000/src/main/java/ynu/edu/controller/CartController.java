//package ynu.edu.controller;
//
//import io.github.resilience4j.bulkhead.annotation.Bulkhead;
//import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
//import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
//import io.github.resilience4j.retry.annotation.Retry;
//import jakarta.annotation.Resource;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import ynu.edu.entity.Cart;
//import ynu.edu.entity.CommonResult;
//import ynu.edu.entity.User;
//import ynu.edu.feign.ServiceProviderService;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.CompletableFuture;
//
//@RestController
//@RequestMapping("/cart")
//public class CartController {
//    @Resource
//    private ServiceProviderService serviceInstance;
//
//    @GetMapping("/getCartById/{userId}")
//    @LoadBalanced
//    @Bulkhead(name="bulkheadA",type = Bulkhead.Type.THREADPOOL,fallbackMethod = "getCartByIdDown")
//    public CompletableFuture<User> getCartById(@PathVariable("userId") Integer userId) {
//        CompletableFuture<User> user = CompletableFuture.supplyAsync(()->{return serviceInstance.GetUserById(userId);});
//        System.out.println("正常执行！");
//        return user;
//    }
//
//    public CompletableFuture<User> getCartByIdDown(Integer userId, Exception e) {
//        e.printStackTrace();
//        String message = "该功能当前异常火爆，请稍后再试！";
//        System.out.println(message);
//        CompletableFuture<User> result = CompletableFuture.supplyAsync(()->{return new CommonResult<>(440,"fallback",new User()).getResult();});
//        return result;
//    }
//
////    @GetMapping("/getCartById/{userId}")
////    @LoadBalanced
//////    @Retry(name="retry1",fallbackMethod = "getCartByIdDown")
//////    @CircuitBreaker(name = "backendA", fallbackMethod = "getCartByIdDown")
////    @RateLimiter(name = "rate1",fallbackMethod = "getCartByIdDown")
////    public CommonResult<Cart> getCartById(@PathVariable("userId") Integer userId) {
////        Cart cart = new Cart();
////        List<String> goods = new ArrayList<>();
////        goods.add("电池");
////        goods.add("无人机");
////        goods.add("笔记本电脑");
////        cart.setGoodList(goods);
////        User u = serviceInstance.GetUserById(userId);
////        cart.setUser(u);
////
////        Integer code = 200;
////        String message = "success(16000)";
////
////        CommonResult<Cart> commonResult = new CommonResult<>();
////        commonResult.setCode(code);
////        commonResult.setMessage(message);
////        commonResult.setResult(cart);
////
////        return commonResult;
////    }
////
////    public CommonResult<Cart> getCartByIdDown(Integer userId, Exception e) {
////        e.printStackTrace();
////        String message = "获取用户" + userId + "信息的服务当前超时，因此方法降级";
////        System.out.println(message);
////        CommonResult<Cart> result = new CommonResult<>(400, message, new Cart());
////        return result;
////    }
//}
