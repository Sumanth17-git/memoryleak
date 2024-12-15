http://localhost:8082/memory-leak
##  HeapDump
kubectl exec -n <namespace> <pod-name> -- jmap -dump:live,format=b,file=/dev/stdout <pid> > ./heapdump.hprof

kubectl exec -n default buggycpu-5b748dc98-dlxvt -- jmap -dump:live,format=b,file=/dev/stdout 1 > ./heapdump.hprof

ls -lh heapdump.hprof
